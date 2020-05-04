SUMMARY = "A mighty, modern style linter"
HOMEPAGE = "https://github.com/stylelint/stylelint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/stylelint/stylelint.git;protocol=https \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://stylelint.sca.description"
SRCREV = "515a845935061bc1771aac5f6956406464a3793d"
S = "${WORKDIR}/git"

inherit npm-helper
inherit native
inherit sca-sanity
inherit sca-description

do_compile[noexec] = "1"

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production stylelint-config-standard@20.0.0    
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}${datadir}
    install ${WORKDIR}/stylelint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
