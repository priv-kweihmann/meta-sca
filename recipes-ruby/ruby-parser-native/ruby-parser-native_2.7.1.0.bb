SUMMARY = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

DEPENDS += "ruby-ast-native"

SRC_URI[md5sum] = "2de774312aeab2e0e83466490b66cd34"
SRC_URI[sha256sum] = "274690ed57ced1bc7acaaeae5389b9c97ebe899097e303337d2b765139cb5c1d"

GEM_NAME = "parser"

inherit sca-sanity
inherit rubygemsnative
