SUMMARY = "RubyGem: azure_mgmt_resources"
DESCRIPTION = "Microsoft Azure Resource Management Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-ms-rest-azure"

SRC_URI[md5sum] = "1eccf606033b36abe82b353635b8d38b"
SRC_URI[sha256sum] = "6c876854318c8ff71561270dd3d8c4a3e4fd78723abb46f610b5e6ce400069c1"

GEM_NAME = "azure_mgmt_resources"

inherit rubygems
