SUMMARY = "Locate per-dist and per-module shared files"
HOMEPAGE = "https://metacpan.org/pod/File::ShareDir"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a22a4899749b8c0c56bc4de923f05e9"

DEPENDS += "\
            perl-class-inspector-native \
            perl-file-sharedir-install-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/File-ShareDir-${PV}.tar.gz"

SRC_URI[md5sum] = "0084f730f4e3d4d89703d92b3ea82f54"
SRC_URI[sha256sum] = "3bb2a20ba35df958dc0a4f2306fc05d903d8b8c4de3c8beefce17739d281c958"

S = "${WORKDIR}/File-ShareDir-${PV}"

inherit cpan
inherit native
