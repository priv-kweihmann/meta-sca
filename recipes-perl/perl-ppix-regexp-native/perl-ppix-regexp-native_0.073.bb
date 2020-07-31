SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "87ef730b6b7d907f7389a4c3cbcc9f6b"
SRC_URI[sha256sum] = "18cdef041d798ab4ab1e5dfa088e61ad59a6b9767b05f7b45e5119e25b3740b7"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
