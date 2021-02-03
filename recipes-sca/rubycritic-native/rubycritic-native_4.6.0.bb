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
SRC_URI[md5sum] = "39350f134adc043928b94a1b296cce3f"
SRC_URI[sha256sum] = "c1e362d4552fab9aca3133417a31e55924df1848ff5541c0cef11249f9b1c1c0"

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
