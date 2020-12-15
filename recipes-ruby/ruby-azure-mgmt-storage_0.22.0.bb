SUMMARY = "RubyGem: azure_mgmt_storage"
DESCRIPTION = "Microsoft Azure Storage Management Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-ms-rest-azure"

SRC_URI[md5sum] = "1c5e93fa433bb08193a0211f3aa5210a"
SRC_URI[sha256sum] = "a01e8af7069bf7c1765f485d76fe91b667baf09a81272888b5449f3eb0a61365"

GEM_NAME = "azure_mgmt_storage"

inherit rubygems
