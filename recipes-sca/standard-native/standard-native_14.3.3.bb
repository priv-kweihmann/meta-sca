SUMMARY = "JavaScript Style Guide, with linter & automatic code fixer"
HOMEPAGE = "https://github.com/standard/standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/standard/standard.git;protocol=https \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://standard.sca.description"
SRCREV = "2a1d8d1d15d64ab0a5ce1fde84b0d5111e85adf5"
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
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}${datadir}
    install ${WORKDIR}/standard.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
