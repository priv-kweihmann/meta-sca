SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "b3f256af360f6e5b9211fe102a70a1c7"
SRC_URI[sha256sum] = "38c38fa9f97662aa1a58359397894e43bdcaaa301b13ed793ef1d3d1d2fb436f"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
