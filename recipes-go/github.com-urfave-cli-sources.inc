SRC_URI_append = " https://proxy.golang.org/github.com/urfave/cli/@v/v1.22.5.zip;srcoutput=github.com/urfave/cli;srcinput=github.com/urfave/cli@v1.22.5;downloadfilename=github-com-urfave-cli-1.22.5.zip;name=github-com-urfave-cli"
SRC_URI[github-com-urfave-cli.sha256sum] = "e041bbae76c31607e696b03b42dacdaf8e8f73b8c14e6e84b9d33914ce324e8f"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/urfave/cli/LICENSE;md5=c542707ca9fc0b7802407ba62310bd8f \
"
