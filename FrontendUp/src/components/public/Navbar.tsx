import {AppBar, Box, Button, Stack, Toolbar, Typography} from "@mui/material";
import logo from '../../assets/favicon.webp'
import useTheme from "../../hooks/useTheme.tsx";
import {useNavigate} from "react-router-dom";
import {AllLandingPages, type LandingPage} from "../../pages/public/landingPages/AllLandingPages.ts";

interface NavbarProps {
    activePage: LandingPage;
    onPageChange: (page: LandingPage) => void;
}

export default function Navbar({onPageChange}: NavbarProps) {
    // Para poder navegar a la página de login
    const navigate = useNavigate();

    const {isDarkMode} = useTheme();

    const barColor: string = isDarkMode ? 'rgba(0, 0, 0, 0.5)' : 'rgba(255, 255, 255, 0.5)'

    return (
        <Box sx={{ display: 'flex' }}>
            <AppBar component={'nav'} sx={{
                backgroundColor: barColor,
                backdropFilter: 'blur(10px)'
            }}>
                <Toolbar>
                    <Box component={'img'} src={logo} width={70} alt={'logo'} />

                    <Typography
                        variant={'h5'}
                        component={'h1'}
                        fontWeight={600}
                        color={'textPrimary'}
                        sx={{ ml: 2, mt: 0.5 }}
                    >
                        SIMBACHE
                    </Typography>

                    <Stack direction={'row'} spacing={2} flexGrow={1} alignItems={'center'} justifyContent={'center'} >
                        { AllLandingPages.map((item, index) => (
                            <Button
                                key={index}
                                color={'primary'}
                                disableRipple
                                onClick={() => onPageChange(item)}
                            >
                                <Typography variant={'body1'} color={'textPrimary'} sx={{ p:1 }}>{item.name}</Typography>
                            </Button>
                        ))}
                    </Stack>

                    <Button
                        variant={'contained'}
                        color={'primary'}
                        onClick={() => navigate('/login')}
                        disableElevation
                    >
                        <Typography variant={'body1'} color={'white'} letterSpacing={1} sx={{p: 0.5, mt:0.5}}>Acceder</Typography>
                    </Button>

                </Toolbar>
            </AppBar>
        </Box>
    );
}