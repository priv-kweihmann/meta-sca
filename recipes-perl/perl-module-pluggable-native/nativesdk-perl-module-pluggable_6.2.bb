SUMMARY = "automatically give your module the ability to have plugins"
HOMEPAGE = "https://metacpan.org/pod/Module::Pluggable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=323;endline=326;md5=a63e0dc94502aefcfbb9b75598561357"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-${PV}.tar.gz"

SRC_URI[md5sum] = "02051fa6f1473a067276ca2e26e3da45"
SRC_URI[sha256sum] = "2743f1cb59c2cac21bf14f0f71beab5ced75a589394a1fd8ac09ecc71599299e"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Module-Pluggable-${PV}"

inherit cpan
inherit_defer nativesdk
