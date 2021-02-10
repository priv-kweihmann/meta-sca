SUMMARY = "Static code analyzer for shell-scripts"
HOMEPAGE = "https://www.shellcheck.net/"
BUGTRACKER = "https://github.com/koalaman/shellcheck/issues"

COMPATIBLE_HOST = "^x86_64-linux|^i586-linux|^arm-linux"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${S}/usr/share/doc/shellcheck/copyright;md5=4225f5a4cb918d258dc26493d45922ef"

DEPENDS += "\
            dpkg-native \
            gmp-native \
            libffi-native \
           "
SRC_URI_append = " file://shellcheck.sca.description"

inherit sca-description
inherit native

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

if [ ! -e "${STAGING_LIBDIR_NATIVE}/libffi.so.7" -a -e "${STAGING_LIBDIR_NATIVE}/libffi.so.6" ]; then
   ln -s ${STAGING_LIBDIR_NATIVE}/libffi.so.6 ${STAGING_LIBDIR_NATIVE}/libffi.so.7
fi

LD_LIBRARY_PATH=${STAGING_LIBDIR_NATIVE} shellcheck \$@
EOF
    chmod 0755 ${D}${bindir}/shellcheck-wrapper
}

FILES_${PN}-man = "${mandir}"
FILES_${PN} = "${bindir} ${datadir}"

## We know it's already stripped - because we're using prebuild things
INSANE_SKIP_${PN} += "already-stripped arch"
