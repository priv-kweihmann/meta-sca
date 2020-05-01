SUMMARY = "Static code analyzer for shell-scripts"
HOMEPAGE = "https://www.shellcheck.net/"
BUGTRACKER = "https://github.com/koalaman/shellcheck/issues"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${S}/usr/share/doc/shellcheck/copyright;md5=4225f5a4cb918d258dc26493d45922ef"

DEPENDS += "\
            dpkg-native \
            gmp-native \
            libffi-native \
           "
SRC_URI += "file://shellcheck.sca.description"

inherit native
inherit sca-sanity
inherit sca-description

do_install() {
    install -d ${D}${bindir}
    cp -R ${B}/usr/bin/* ${D}${bindir}
    install -d ${D}${mandir}
    cp -R ${B}/usr/share/man/* ${D}${mandir}
    install -d ${D}${datadir}
    install ${WORKDIR}/shellcheck.sca.description ${D}${datadir}
}

FILES_${PN}-man = "${mandir}"
FILES_${PN} = "${bindir}/shellcheck ${datadir}"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped file-rdeps arch"
