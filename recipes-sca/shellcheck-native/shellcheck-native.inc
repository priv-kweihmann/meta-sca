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

    # Add a wrapper script to fix the linking issues
    cat << EOF > ${D}${bindir}/shellcheck-wrapper
#!/bin/sh
LD_LIBRARY_PATH=${STAGING_LIBDIR_NATIVE} shellcheck
EOF
    chmod 0755 ${D}${bindir}/shellcheck-wrapper
}

FILES_${PN}-man = "${mandir}"
FILES_${PN} = "${bindir} ${datadir}"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped arch"
