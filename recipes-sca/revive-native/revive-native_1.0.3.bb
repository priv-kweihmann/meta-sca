SUMMARY = "faster, stricter, configurable, extensible, and beautiful than golint"
HOMEPAGE = "https://github.com/mgechev/revive"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0"

DEPENDS += "\
            github.com-blang-semver-native \
            github.com-burntsushi-toml-native \
            github.com-fatih-color-native \
            github.com-fatih-structtag-native \
            github.com-mgechev-dots-native \
            github.com-mitchellh-go-homedir-native \
            github.com-olekukonko-tablewriter-native \
            github.com-pkg-errors-native \
            golang.org-x-tools-native \
            k8s.io-klog-native \
           "

SRC_URI = "\
           git://${GO_IMPORT};protocol=https;name=revive \
           file://revive.sca.description \
          "
SRCREV = "51dd8335dd735dc0d6d32d71bc56c6953de9eb1b"
GO_IMPORT = "github.com/mgechev/revive"

inherit go
inherit native
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/revive.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
