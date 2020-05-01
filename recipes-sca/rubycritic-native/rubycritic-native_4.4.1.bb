SUMMARY = "RubyCritic is a tool that wraps around various static analysis gems"
HOMEPAGE = "https://github.com/whitesmith/rubycritic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ebcb01890999ed287441ae4afce9a346"

DEPENDS += "\
            reek-native \
            ruby-flay-native \
            ruby-flog-native \
            ruby-launchy-native \
            ruby-parser-native \
            ruby-rainbow-native \
            ruby-ruby-parser-native \
            ruby-simplecov-native \
            ruby-tty-which-native \
            ruby-virtus-native \
            "

SRC_URI += "file://rubycritic.sca.description"
SRC_URI[md5sum] = "8adf9c323e4d12fac3fb732e562c6716"
SRC_URI[sha256sum] = "f404f5f0d4f7446d8c01f77f4b6b68614cd94999f22251d965b25055ff28e296"

GEM_NAME = "rubycritic"

inherit sca-sanity
inherit sca-description
inherit rubygemsnative

do_compile_prepend() {
    sed -i 's/<launchy>.freeze, \["= 2.4.3"\]/<launchy>.freeze, \[">= 2.4.3"\]/g' ${S}/rubycritic-${PV}.gemspec
    sed -i 's/<reek>.freeze, \["< 6.0", "~> 5.0"\]/<reek>.freeze, \[">= 5.0"\]/g' ${S}/rubycritic-${PV}.gemspec
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/rubycritic.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
