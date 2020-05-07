SUMMARY = "Code smell detector for Ruby"
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

DEPENDS += "\
            ruby-codeclimate-engine-rb-native \
            ruby-kwalify-native \
            ruby-parser-native \
            ruby-psych-native \
            ruby-rainbow-native \
            "

SRC_URI_append = " file://reek.sca.description"
SRC_URI[md5sum] = "fbcd55cfc102a0b035f4a53f005574f9"
SRC_URI[sha256sum] = "dfc580d8ac122fbd302aae3d7f959d2a1dccf33a316767b415f99360a7fd165b"

GEM_NAME = "reek"

inherit sca-sanity
inherit sca-description
inherit rubygemsnative

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
