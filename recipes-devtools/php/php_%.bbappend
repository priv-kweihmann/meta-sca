DEPENDS_class-native = "zlib-native libxml2-native virtual/libiconv-native"

EXTRA_OECONF_class-native = " \
                --enable-mbstring \
                --with-zlib=${STAGING_LIBDIR_NATIVE}/.. \
                ${COMMON_EXTRA_OECONF} \
"

PACKAGECONFIG_class-native = "openssl zip"

FILES_${PN}_class-native += "${sysconfdir}"

do_install_append_class-native() {
    mkdir -p ${D}${sysconfdir}/php
    extdir=$(${D}${bindir}/php-config --extension-dir)
    cat ${S}/php.ini-production | \
            sed -e "s,;extension_dir = \"\./\",extension_dir = \"${extdir}\",g" | \
            sed -e "s#${WORKDIR}#%SYSROOT%#g" \
            > ${D}${sysconfdir}/php/php.ini
}