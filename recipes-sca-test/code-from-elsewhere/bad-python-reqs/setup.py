import setuptools

setuptools.setup(
    name="foorecipe",
    version="0.0.1",
    author="Mr.X",
    packages=setuptools.find_packages(),
    install_requires=[
        'superset<=0.10.0',
        'tablib<=0.11.4',
    ]
)