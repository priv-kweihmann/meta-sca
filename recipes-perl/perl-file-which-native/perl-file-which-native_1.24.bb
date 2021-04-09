SUMMARY = "Perl implementation of the which utility as an API"
HOMEPAGE = "https://metacpan.org/pod/File::Which"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4aece164a4cb5012c03e0b99aa7c6a4"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-${PV}.tar.gz"

SRC_URI[md5sum] = "3578a39424d3254e48057ffafbde9a96"
SRC_URI[sha256sum] = "7c5414dd6d5c61cb992fdd257aefe52f9a80bf55158cd5ec17469199d0b12eef"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
