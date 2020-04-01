SUMMARY = "A mighty, modern style linter"
HOMEPAGE = "https://github.com/stylelint/stylelint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/stylelint/stylelint.git;protocol=https;tag=${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://stylelint.sca.description"

S = "${WORKDIR}/git"

inherit npm-helper
inherit native
inherit sca-sanity

do_compile[noexec] = "1"

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}${datadir}
    install ${WORKDIR}/stylelint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
