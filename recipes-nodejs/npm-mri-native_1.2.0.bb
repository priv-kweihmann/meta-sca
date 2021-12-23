SUMMARY = "NPM: mri"
DESCRIPTION = "Quickly scan for CLI flags and arguments"
HOMEPAGE = "https://github.com/lukeed/mri#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mri/-/mri-1.2.0.tgz"
SRC_URI[md5sum] = "3447f63dcd06670e37015dddee114918"
SRC_URI[sha256sum] = "9e383990963c167baa471cc928a02eb1768ee2ffabf8117082a09b5213f9a575"

NPM_PKGNAME = "mri"

inherit npmhelper
inherit native
