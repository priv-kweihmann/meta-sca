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
            ruby-rexml-native \
            ruby-ruby-parser-native \
            ruby-simplecov-native \
            ruby-tty-which-native \
            ruby-virtus-native \
            "

SRC_URI_append = " file://rubycritic.sca.description"
SRC_URI[md5sum] = "2b98ea1abcc1ae9dc8507e144bc0d29a"
SRC_URI[sha256sum] = "1530cbd82a48e75909bc74efc89e0d0901359aa86d2806ce385d68d703b19095"

GEM_NAME = "rubycritic"

inherit sca-description
inherit rubygems
inherit native

do_compile_prepend() {
    sed -i 's/<launchy>.freeze, \["= 2.4.3"\]/<launchy>.freeze, \[">= 2.4.3"\]/g' ${S}/rubycritic-${PV}.gemspec
    sed -i 's/<reek>.freeze, \["< 6.0", "~> 5.0"\]/<reek>.freeze, \[">= 5.0"\]/g' ${S}/rubycritic-${PV}.gemspec
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/rubycritic.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
