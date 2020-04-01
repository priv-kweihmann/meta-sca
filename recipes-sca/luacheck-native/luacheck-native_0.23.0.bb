SUMMARY = "A tool for linting and static analysis of Lua code"
HOMEPAGE = "https://github.com/mpeterv/luacheck"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

SRC_URI = "git://github.com/mpeterv/luacheck.git;protocol=https;tag=${PV} \
           file://luacheck.sca.description"

S = "${WORKDIR}/git"

inherit native
inherit luarocks
inherit sca-sanity

do_install_append() {
    ## We need to tweak some hardcoded paths in the luacheck wrapper
    sed -i "s#${D}##g" ${D}${bindir}/luacheck
    ## Install tool description
    install -d ${D}${datadir}
    install ${WORKDIR}/luacheck.sca.description ${D}${datadir}/
}
