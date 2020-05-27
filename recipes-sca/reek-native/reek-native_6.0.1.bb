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
SRC_URI[md5sum] = "946feccca2b445b50d1b35e2b338162a"
SRC_URI[sha256sum] = "befaea6ad58167e20d2e329d79b527b8017de103e1e81c1bca351ce375313bdb"

GEM_NAME = "reek"

inherit sca-description
inherit rubygemsnative

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
