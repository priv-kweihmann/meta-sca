SUMMARY = "RubyGem: azure_mgmt_key_vault"
DESCRIPTION = "Microsoft Azure Resource Management Key Vault Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-ms-rest-azure"

SRC_URI[md5sum] = "e1ae9e3b6dbf24aa2b8f8318a2746f68"
SRC_URI[sha256sum] = "bf22f4d4486b6c2f811aa53bc7d57ec040f524d04d2a9e73f4a390414b548e38"

GEM_NAME = "azure_mgmt_key_vault"

inherit rubygems
