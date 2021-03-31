SRC_URI_append = " https://proxy.golang.org/github.com/mitchellh/cli/@v/v1.1.2.zip;srcoutput=github.com/mitchellh/cli;srcinput=github.com/mitchellh/cli@v1.1.2;downloadfilename=github-com-mitchellh-cli-1.1.2.zip;name=github-com-mitchellh-cli"
SRC_URI[github-com-mitchellh-cli.sha256sum] = "38cf52dd2c968e946f3364c8dcf68db56da6ccfd4b78d63b044835c3d38c2770"

MOD_LICENSE_append = " \
    MPL-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mitchellh/cli/LICENSE;md5=b278a92d2c1509760384428817710378 \
"
