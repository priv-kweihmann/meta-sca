SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2acb4ae62955b17ab197a3b6ac24f99f"
SRC_URI[sha256sum] = "68787eb070f1df49f59a266329c3bc3cc93ecdf1f904f5d52c27ec6110fd0886"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
