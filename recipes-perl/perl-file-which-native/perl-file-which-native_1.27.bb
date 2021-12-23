SUMMARY = "Perl implementation of the which utility as an API"
HOMEPAGE = "https://metacpan.org/pod/File::Which"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4aece164a4cb5012c03e0b99aa7c6a4"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-${PV}.tar.gz"

SRC_URI[md5sum] = "d5c9154262b93398f0750ec364207639"
SRC_URI[sha256sum] = "3201f1a60e3f16484082e6045c896842261fc345de9fb2e620fd2a2c7af3a93a"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
