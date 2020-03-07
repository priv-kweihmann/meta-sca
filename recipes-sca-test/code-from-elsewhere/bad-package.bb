SUMMARY = "A really bad package"
LICENSE = "CLOSED"

SRC_URI += "\
            file://test1/LICENSE;subdir=source \
            file://test1/LICENSE.gpl2;subdir=source \
            file://test2/LICENSE;subdir=source \
            file://test1/test-1.sh;subdir=source \
            file://test2/test-2.sh;subdir=source \
            file://simple-hello-world.c;subdir=source \
           "

S = "${WORKDIR}/source"

do_configure() {
    :
}

do_compile() {
    :
}

do_install() {
    install -d ${D}${bindir}
    install -m 0777 ${S}/test1/test-1.sh ${D}${bindir}

    install -d ${D}/opt/somestrangepath
    install -m 0777 ${S}/test2/test-2.sh ${D}/opt/somestrangepath/magic.sh

    install -d ${D}${datadir}/myhiddensources
    install -m 0644 ${S}/simple-hello-world.c ${D}${datadir}/myhiddensources
}

FILES_${PN} += "${datadir}"
FILES_${PN}-dev += "/opt/somestrangepath"

inherit sca

SCA_AVAILABLE_MODULES = "pkgqaenc"

inherit sca-licensecheck
