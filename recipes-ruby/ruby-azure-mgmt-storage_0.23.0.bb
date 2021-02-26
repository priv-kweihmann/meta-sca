SUMMARY = "RubyGem: azure_mgmt_storage"
DESCRIPTION = "Microsoft Azure Storage Management Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-ms-rest-azure"

SRC_URI[md5sum] = "22743a5ab60b321ae1d7eb273fe6c6c8"
SRC_URI[sha256sum] = "389b5aaa88daba72e8e266403eb5026039b1033e8d1cd4054eb6bbf3ed346046"

GEM_NAME = "azure_mgmt_storage"

inherit rubygems
