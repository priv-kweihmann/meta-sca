SUMMARY = "Locate per-dist and per-module shared files"
HOMEPAGE = "https://metacpan.org/pod/File::ShareDir"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-${PV}.tar.gz"

SRC_URI[md5sum] = "f2a0eee9f04c93753dd56437175e5bda"
SRC_URI[sha256sum] = "59d90bfdf98c4656ff4173e62954ea8cf0de66565e35d108ecd7050596cb8328"

S = "${WORKDIR}/File-ShareDir-${PV}"

DEPENDS += "\
            perl-class-inspector-native \
            perl-file-sharedir-install-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=2a22a4899749b8c0c56bc4de923f05e9"

inherit native
inherit cpan
