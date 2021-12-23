SUMMARY = "NPM: natural-compare"
DESCRIPTION = "Compare strings containing a mix of letters and numbers in the way a human being would in sort order."
HOMEPAGE = "https://github.com/litejs/natural-compare-lite#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=122;md5=a2721eeec1320f4d924356a266f4b1e9"

SRC_URI = "https://registry.npmjs.org/natural-compare/-/natural-compare-1.4.0.tgz"
SRC_URI[md5sum] = "210787ea3f1a715dd963317ebfc5193f"
SRC_URI[sha256sum] = "5e5569ecd12064f73632a8c18a45b1d1de4a27b699a671864801f1c35ee779ee"

NPM_PKGNAME = "natural-compare"

inherit npmhelper
inherit native
