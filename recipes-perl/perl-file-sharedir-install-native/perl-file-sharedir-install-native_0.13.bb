SUMMARY = "Install shared files"
HOMEPAGE = "https://metacpan.org/pod/File::ShareDir::Install"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96eaea1ab124e0ef3335eb99cadc5bae"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/File-ShareDir-Install-${PV}.tar.gz"

SRC_URI[md5sum] = "5eabd44a5d7d84bf2e8e502491226287"
SRC_URI[sha256sum] = "45befdf0d95cbefe7c25a1daf293d85f780d6d2576146546e6828aad26e580f9"

S = "${WORKDIR}/File-ShareDir-Install-${PV}"

inherit cpan
inherit native
