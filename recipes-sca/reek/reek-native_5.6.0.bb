SUMMARY = "Code smell detector for Ruby"
HOMEPAGE = "https://github.com/mgechev/revive"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

DEPENDS += "\
            ruby-codeclimate-engine-rb-native \
            ruby-kwalify-native \
            ruby-parser-native \
            ruby-psych-native \
            ruby-rainbow-native \
            "

SRC_URI += "file://reek.sca.description"
SRC_URI[md5sum] = "265803d907e520f43583bb0c669a252f"
SRC_URI[sha256sum] = "c20ab6c8ba6d129f90d470b7869e2e92777cfd189cf11b196623b49927ac8fbf"

GEM_NAME = "reek"

inherit sca-sanity
inherit rubygemsnative

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reek.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
