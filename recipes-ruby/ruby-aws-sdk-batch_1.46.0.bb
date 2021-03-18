SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fa96481cea52ebbede84216ccccf8cb1"
SRC_URI[sha256sum] = "108e1bb22c8e873b4e1c99a15a6970fdbf9f53cbf26730c3bd6603e0cf5623bb"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
