SUMMARY = "A tool for linting and static analysis of Lua code"
HOMEPAGE = "https://github.com/luarocks/luacheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

SRC_URI = "git://github.com/luarocks/luacheck.git;branch=master;protocol=https \
           file://luacheck.sca.description"
SRCREV = "abf7386a892df4ce566fef9e4640ddbf9af78411"

S = "${WORKDIR}/git"

inherit luarocks
inherit sca-description
inherit native

do_install:append() {
    ## We need to tweak some hardcoded paths in the luacheck wrapper
    sed -i "s#${D}##g" ${D}${bindir}/luacheck
    ## Install tool description
    install -d ${D}${datadir}
    install ${WORKDIR}/luacheck.sca.description ${D}${datadir}/
}
