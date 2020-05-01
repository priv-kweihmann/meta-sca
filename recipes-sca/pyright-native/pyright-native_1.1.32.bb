SUMMARY = "Static type checker for Python"
HOMEPAGE = "https://github.com/Microsoft/pyright"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/microsoft/pyright.git;protocol=https \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://pyright.sca.description"
SRCREV = "e85a7d62ad0133845d4c11e238c3a684b809fdc4"
UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>1\.\d+\.\d+)"

S = "${WORKDIR}/git"

inherit native
inherit sca-sanity
inherit sca-description
inherit npm-helper

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
    install ${WORKDIR}/pyright.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
