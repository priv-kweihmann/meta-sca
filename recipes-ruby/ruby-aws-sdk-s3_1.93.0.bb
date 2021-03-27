SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "36d45e80514721695dbed8fd9bb7dd13"
SRC_URI[sha256sum] = "24494c3d6ce8a3bb03092b4ac219bfc2bfe42cfa4ca857f97386dd417e72c247"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
