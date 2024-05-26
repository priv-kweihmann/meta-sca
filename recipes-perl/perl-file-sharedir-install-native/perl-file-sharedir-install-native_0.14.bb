SUMMARY = "Install shared files"
HOMEPAGE = "https://metacpan.org/pod/File::ShareDir::Install"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a8070807ef71bcb5c0523e6dfa84727"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-ShareDir-Install-${PV}.tar.gz"

SRC_URI[md5sum] = "bac4d924f3d863b00648ab56ec0dcbdc"
SRC_URI[sha256sum] = "8f9533b198f2d4a9a5288cbc7d224f7679ad05a7a8573745599789428bc5aea0"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/File-ShareDir-Install-${PV}"

inherit cpan
inherit_defer native
