SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "09b3f57a23a20795904353a6b5bcd68b"
SRC_URI[sha256sum] = "07dbbb62d0398b4d53a4ba87dc9ee020a11f3f1716c31584effc46312c2482f4"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
