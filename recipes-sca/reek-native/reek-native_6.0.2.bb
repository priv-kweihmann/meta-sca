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
SRC_URI[md5sum] = "7ff90d6cf1fdd50fedd72c8e0104da37"
SRC_URI[sha256sum] = "b4b26ba047d8fbe94d213786f05527502784ed765440f99762886031e8e2e72f"

GEM_NAME = "reek"

inherit sca-description
inherit rubygemsnative

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
