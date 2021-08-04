PACKAGECONFIG:class-native = "mbstring openssl zip"
PACKAGECONFIG[zip] = "--with-zip --with-zlib-dir=${STAGING_EXECPREFIXDIR},,libzip"
PACKAGECONFIG[mbstring] = "--enable-mbstring,,"

FILES:${PN}:class-native += "${sysconfdir}"

do_install:append:class-native() {
    install -d ${D}${sysconfdir}/php
    extdir=$(${D}${bindir}/php-config --extension-dir)
    cat ${S}/php.ini-production | \
            sed -e "s,;extension_dir = \"\./\",extension_dir = \"${extdir}\",g" | \
            sed -e "s#${WORKDIR}#%SYSROOT%#g" \
            > ${D}${sysconfdir}/php/php.ini
}
