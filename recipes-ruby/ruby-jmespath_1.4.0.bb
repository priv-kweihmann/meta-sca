SUMMARY = "RubyGem: jmespath"
DESCRIPTION = "Implements JMESPath for Ruby"
HOMEPAGE = "http://github.com/trevorrowe/jmespath.rb"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8cc789b082b3d97e1ccc5261f8594d3f"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "16b17ebb02e229dd83138df36d6f2470"
SRC_URI[sha256sum] = "ee5930ed833d3472fce31abf2f4a39852718e90b099dc2a6713234d600539cb4"

GEM_NAME = "jmespath"

inherit rubygems
