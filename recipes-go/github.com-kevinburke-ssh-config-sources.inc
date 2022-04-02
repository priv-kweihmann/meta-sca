SRC_URI += "https://proxy.golang.org/github.com/kevinburke/ssh_config/@v/v1.1.0.zip;srcoutput=github.com/kevinburke/ssh_config;srcinput=github.com/kevinburke/ssh_config@v1.1.0;downloadfilename=github-com-kevinburke-ssh-config-1.1.0.zip;name=github-com-kevinburke-ssh-config"
SRC_URI[github-com-kevinburke-ssh-config.sha256sum] = "79ddea75ed7ea52aeae0aca78e4a1dd9fd3f63984c4dfe2f4b2497857ed55dfb"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kevinburke/ssh_config/LICENSE;md5=d95a448ae964e953f0a77aeca12959be \
"

GOSRC_INCLUDEGUARD += "github.com-kevinburke-ssh-config-sources.inc"

