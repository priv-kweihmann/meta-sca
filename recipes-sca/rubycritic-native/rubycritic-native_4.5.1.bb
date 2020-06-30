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

SRC_URI_append = " file://rubycritic.sca.description"
SRC_URI[md5sum] = "e73dde2ea7243fc77ac12a7bb2631bad"
SRC_URI[sha256sum] = "c0b2b15a8066a1221194f7bcf6e4dd564fbf565f933b5cb7e87b15038ef8bb74"

GEM_NAME = "rubycritic"

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
