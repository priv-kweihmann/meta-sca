DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://simple-hello-world.c"

inherit sca

S = "${WORKDIR}"

do_compile() {
    ${CC} -Werror simple-hello-world.c ${CFLAGS} ${LDFLAGS} -o simple-hello-world
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 simple-hello-world ${D}${bindir} 
}


DEPENDS += "cbmc-native"