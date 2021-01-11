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
SRC_URI[md5sum] = "946ff94aaf22808e07117f0dd912251e"
SRC_URI[sha256sum] = "e262cc8ce4cce4ea259bcdcc50f9c4a90d39f3e0e93b9d42f0c400d882dc8efe"

GEM_NAME = "reek"

inherit sca-description
inherit rubygems
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
