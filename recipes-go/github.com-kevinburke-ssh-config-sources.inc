SRC_URI += "https://proxy.golang.org/github.com/kevinburke/ssh_config/@v/v1.2.0.zip;srcoutput=github.com/kevinburke/ssh_config;srcinput=github.com/kevinburke/ssh_config@v1.2.0;downloadfilename=github-com-kevinburke-ssh-config-1.2.0.zip;name=github-com-kevinburke-ssh-config"
SRC_URI[github-com-kevinburke-ssh-config.sha256sum] = "9ddb8038a222880f96080264a314a205deea58a0b9db9c6d314e79e085f02ec3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kevinburke/ssh_config/LICENSE;md5=d95a448ae964e953f0a77aeca12959be \
"

GOSRC_INCLUDEGUARD += "github.com-kevinburke-ssh-config-sources.inc"

