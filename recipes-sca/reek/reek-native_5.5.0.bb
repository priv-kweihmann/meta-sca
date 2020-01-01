SUMMARY = "Code smell detector for Ruby"
HOMEPAGE = "https://github.com/mgechev/revive"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

SRC_URI[md5sum] = "0e503ba9669e5c0d89abbbee5357cf6f"
SRC_URI[sha256sum] = "8706f6013da6ebfde5f9483c906593ae296b938358ca363798ad23f47df76435"

GEM_NAME = "reek"

DEPENDS += "\
            ruby-codeclimate-engine-rb-native \
            ruby-kwalify-native \
            ruby-parser-native \
            ruby-psych-native \
            ruby-rainbow-native \
            "

inherit sca-sanity
inherit rubygemsnative

SRC_URI += "file://reek.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

