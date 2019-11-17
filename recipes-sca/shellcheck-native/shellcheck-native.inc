SUMMARY = "Static code analyzer for shell-scripts"
DESCRIPTION = " Static code analyzer for shell-scripts"

HOMEPAGE = " https://www.shellcheck.net/"
BUGTRACKER = " https://github.com/koalaman/shellcheck/issues"
LICENSE = "GPLv3"

inherit native
inherit sca-sanity

SRC_URI += "file://shellcheck.sca.description \
            file://shellcheck.sca.score"

DEPENDS += "gmp-native libffi-native dpkg-native dpkg-native"

FILES_${PN}-man = "${mandir}/**"
FILES_${PN} = "${bindir}/shellcheck ${datadir}"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped file-rdeps arch"

do_install() {
    install -d ${D}${bindir}
    cp -R ${B}/usr/bin/* ${D}${bindir}
    install -d ${D}${mandir}
    cp -R ${B}/usr/share/man/* ${D}${mandir}
    install -d ${D}${datadir}
    install ${WORKDIR}/shellcheck.sca.description ${D}${datadir}
    install ${WORKDIR}/shellcheck.sca.score ${D}${datadir}
}
