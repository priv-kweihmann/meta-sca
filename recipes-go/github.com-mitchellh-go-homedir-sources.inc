SRC_URI_append = " https://proxy.golang.org/github.com/mitchellh/go-homedir/@v/v1.1.0.zip;srcoutput=github.com/mitchellh/go-homedir;srcinput=github.com/mitchellh/go-homedir@v1.1.0;downloadfilename=github-com-mitchellh-go-homedir-1.1.0.zip;name=github-com-mitchellh-go-homedir"
SRC_URI[github-com-mitchellh-go-homedir.sha256sum] = "fffec361fc7e776bb71433560c285ee2982d2c140b8f5bfba0db6033c0ade184"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mitchellh/go-homedir/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"
