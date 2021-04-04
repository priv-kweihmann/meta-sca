SRC_URI += "https://proxy.golang.org/github.com/streadway/handy/@v/v0.0.0-20200128134331-0f66f006fb2e.zip;srcoutput=github.com/streadway/handy;srcinput=github.com/streadway/handy@v0.0.0-20200128134331-0f66f006fb2e;downloadfilename=github-com-streadway-handy-0.0.0-20200128134331-0f66f006fb2e.zip;name=github-com-streadway-handy"
SRC_URI[github-com-streadway-handy.sha256sum] = "2327c324bf47ed407943e99fb5a4da72e88d53a7660462ae1862fbb95728c9da"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/streadway/handy/LICENSE;md5=a4307e0c31e2c05ae10e11b4ae42686b \
"

GOSRC_INCLUDEGUARD += "github.com-streadway-handy-sources.inc"

