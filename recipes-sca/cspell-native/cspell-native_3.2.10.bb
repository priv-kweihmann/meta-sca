SUMMARY = "A Spell Checker for Code!"
HOMEPAGE = "https://github.com/Jason3S/cspell"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/streetsidesoftware/cspell.git;protocol=https;tag=v${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=image/${libdir} \
           file://cspell.sca.description"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>3\.\d+\.\d+)"

S = "${WORKDIR}/git"

inherit native
inherit npm-helper
inherit sca-sanity

do_compile[noexec] = "1"

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}${datadir}
    install ${WORKDIR}/cspell.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
